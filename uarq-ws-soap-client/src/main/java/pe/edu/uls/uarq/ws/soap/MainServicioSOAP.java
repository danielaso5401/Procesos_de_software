package pe.edu.uls.uarq.ws.soap;

import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;

public class MainServicioSOAP {
	public static void main(String[] args) throws RemoteException {
		SoapAlumnoProxy ws = new SoapAlumnoProxy();
		Alumno[] arrAlu =  ws.consultaAlumnmos("Daniel");
		for (int i = 0; i < arrAlu.length; i++) {
			Alumno alumno = arrAlu[i];
			System.out.println(alumno.getCodigo()+" : "+alumno.getNombres());
		}
	}
}
