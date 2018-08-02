/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatec.aula.dao;

import br.edu.fatec.aula.model.Carros;
import br.edu.fatec.aula.model.HibernateUtil;
import br.edu.fatec.aula.view.ConsultaCarroInternalFrame;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Tiago Guerino
 */
public class CarrosDAO {

    public void insere(Carros c) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();

            c.getAno();
            c.getCilindradas();
            c.getCombustivel();
            c.getCor();
            c.getKm();
            c.getMarca();
            c.getModelo();
            c.getOpcional();
            c.getTipo();
            c.getValor();

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
