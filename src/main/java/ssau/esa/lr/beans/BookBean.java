package ssau.esa.lr.beans;

import ssau.esa.lr.entity.Book;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;


@Singleton
public class BookBean {

    @PersistenceContext(unitName = "esa")
    private EntityManager em;

    public Collection<Book> findAll(){
        return em.createQuery("SELECT b FROM Book b", Book.class).getResultList();
    }
}