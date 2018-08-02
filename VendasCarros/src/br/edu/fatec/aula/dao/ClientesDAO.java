/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatec.aula.dao;

import br.edu.fatec.aula.model.Clientes;
import br.edu.fatec.aula.model.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Tiago Guerino
 */
public class ClientesDAO {

    public void insere(Clientes c) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();
            
            c.getBairro();
            c.getCelular();
            c.getCep();
            c.getCidade();
            c.getCivil();
            c.getComplemento();
            c.getCpf();
            c.getEmail();
            c.getEndereco();
            c.getEstado();
            c.getEstado();
            c.getNascimento();
            c.getNome();
            c.getOcupacao();
            c.getOrgao();
            c.getRg();
            c.getSalario();
            c.getSexo();
            c.getTelefone();
            
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
