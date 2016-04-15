package br.com.unasp.projeto.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class BaseModel implements Serializable, Comparable<BaseModel> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseModel)) {
            return false;
        }

        BaseModel baseModel = (BaseModel) o;

        return id != null && id.equals(baseModel.id);
    }

    @Override
    public int hashCode() {
        if (id != null) {
            return id.hashCode();
        } else {
            return -1;
        }
    }

    public int compareTo(BaseModel baseModel) {
        return this.id.compareTo(baseModel.getId());
    }
}
