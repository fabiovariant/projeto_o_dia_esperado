package br.com.unasp.projeto.repository.impl;

import br.com.unasp.projeto.models.BaseModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDao<T extends BaseModel> {

    @SuppressWarnings("unchecked")
	private Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    @PersistenceContext
    private EntityManager entityManager;

    public T get(final Integer id) {
        return get(id, false);
    }

    private T get(final Integer id, boolean includeDeleted) {
        if (id != null) {
            T object =  entityManager.find(clazz, id);
            return object;
        }

        return null;
    }

    public List<T> getAll() {
        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<T> criteria = builder.createQuery(clazz);

        Root<T> tRoot = criteria.from(clazz);

        List<Predicate> wherePredicates = new ArrayList<Predicate>();
        wherePredicates.add(builder.equal(tRoot.get("deleted"), false));

        buildWhereClause(criteria, wherePredicates);

        return getEntityManager().createQuery(criteria).getResultList();
    }

    @SuppressWarnings("unchecked")
	public List<T> getAllIncludingDeleted() {
        return entityManager.createQuery("from " + clazz.getName()).getResultList();
    }

    public void save(final T entity) {

        if (entity.getId() == null || entity.getId() == 0) {
            entityManager.persist(entity);
        } else {
            entityManager.merge(entity);
        }
    }

    public void delete(final T entity) {
        save(entity);
    }

    @SuppressWarnings("hiding")
	protected <T> void buildWhereClause(CriteriaQuery<T> criteria, List<Predicate> wherePredicates) {
        if (!wherePredicates.isEmpty()) {
            Predicate[] predicates = new Predicate[wherePredicates.size()];

            for (int x = 0; x < wherePredicates.size(); x++) {
                predicates[x] = wherePredicates.get(x);
            }

            criteria.where(entityManager.getCriteriaBuilder().and(predicates));
        }
    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
