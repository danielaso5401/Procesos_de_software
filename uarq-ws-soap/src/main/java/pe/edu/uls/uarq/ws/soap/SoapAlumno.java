package pe.edu.uls.uarq.ws.soap;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Session Bean implementation class SoapAlumno
 */
@WebService
//esta notacion nos permite desplegar un webservice soap para que asi se comunique con cualquier entorno
@Stateless
@LocalBean
public class SoapAlumno {

    /**
     * Default constructor. 
     */
    public SoapAlumno() {
        // TODO Auto-generated constructor stub
    }
    @WebMethod
    public List<Alumno> consultaAlumnmos(String nombre) {
    	List <Alumno> lst =new ArrayList<Alumno>();
    	for (int i=1; i<=10; i++) {
    		Alumno a=new Alumno();
    		a.setCodigo(100+i);
    		a.setNombres(nombre+" "+a.getCodigo());
    		lst.add(a);
    	}
    	return lst;
    }
    
    
}
