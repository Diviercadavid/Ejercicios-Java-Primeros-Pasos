/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Modelo.*;

public class Operaciones {

    public void altaUsuarios(Usuarios user) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = null;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        sesion.close();
        JOptionPane.showMessageDialog(null, "Insertado Correctamente ");

    }

    public void altaNoticias(Noticias noti) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = null;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(noti);
        tx.commit();
        sesion.close();
        JOptionPane.showMessageDialog(null, "Insertado Correctamente ");

    }

    public Usuarios buscarUsuarios(String usuario) {
        Usuarios usr;
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = null;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        usr = (Usuarios) session.get(Usuarios.class, usuario);

        tx.commit();
        sesion.close();
        return usr;
    }

}
