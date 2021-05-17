package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Abonado;

public class AbonadoDao {

	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	public Abonado traerRodado(long dni) {
		Abonado objeto = null;
			try {
				iniciaOperacion();
				String strHQL = " from Abonado a where a.dni = "+ dni;
				objeto = (Abonado)session.createQuery(strHQL).uniqueResult();
			} finally {
				session.close();
			}
			return objeto;
		}
}
