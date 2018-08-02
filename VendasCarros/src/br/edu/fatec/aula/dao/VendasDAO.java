/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatec.aula.dao;

import br.edu.fatec.aula.model.HibernateUtil;
import br.edu.fatec.aula.model.Venda;
import br.edu.fatec.aula.model.VendaId;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Tiago Guerino
 */
public class VendasDAO {

    public void insere(Venda c, VendaId vid) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();

            vid.getIdvenda();
            vid.getClientesIdclientes();
            vid.getCarrosIdcarros();
            c.getEntrada();
            c.getTotal();
            c.getParcelas();

            session.save(c);

            session.getTransaction().commit();

        } catch (HibernateException e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            session.close();
        }
    }
}
