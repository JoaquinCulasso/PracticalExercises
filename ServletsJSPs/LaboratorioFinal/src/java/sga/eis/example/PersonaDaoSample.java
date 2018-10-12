/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package sga.eis.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import sga.eis.dao.PersonaDao;
import sga.eis.dto.Persona;
import sga.eis.exceptions.PersonaDaoException;
import sga.eis.factory.PersonaDaoFactory;

public class PersonaDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		 findAll();
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			PersonaDao _dao = getPersonaDao();
			Persona _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getPersonaDao'
	 * 
	 * @return PersonaDao
	 */
	public static PersonaDao getPersonaDao()
	{
		return PersonaDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Persona dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdPersona() );
		buf.append( ", " );
		buf.append( dto.getNombre() );
		buf.append( ", " );
		buf.append( dto.getApellido() );
		System.out.println( buf.toString() );
	}

}