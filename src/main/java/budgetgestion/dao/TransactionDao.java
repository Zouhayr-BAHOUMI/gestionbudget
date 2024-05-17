package budgetgestion.dao;

import budgetgestion.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class TransactionDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void createTransaction(Transaction transaction){
        this.hibernateTemplate.save(transaction);
    }


}
