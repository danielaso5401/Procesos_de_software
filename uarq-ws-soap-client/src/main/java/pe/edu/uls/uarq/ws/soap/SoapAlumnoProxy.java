package pe.edu.uls.uarq.ws.soap;

public class SoapAlumnoProxy implements pe.edu.uls.uarq.ws.soap.SoapAlumno {
  private String _endpoint = null;
  private pe.edu.uls.uarq.ws.soap.SoapAlumno soapAlumno = null;
  
  public SoapAlumnoProxy() {
    _initSoapAlumnoProxy();
  }
  
  public SoapAlumnoProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapAlumnoProxy();
  }
  
  private void _initSoapAlumnoProxy() {
    try {
      soapAlumno = (new pe.edu.uls.uarq.ws.soap.SoapAlumnoServiceLocator()).getSoapAlumnoPort();
      if (soapAlumno != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soapAlumno)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soapAlumno)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soapAlumno != null)
      ((javax.xml.rpc.Stub)soapAlumno)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pe.edu.uls.uarq.ws.soap.SoapAlumno getSoapAlumno() {
    if (soapAlumno == null)
      _initSoapAlumnoProxy();
    return soapAlumno;
  }
  
  public pe.edu.uls.uarq.ws.soap.Alumno[] consultaAlumnmos(java.lang.String arg0) throws java.rmi.RemoteException{
    if (soapAlumno == null)
      _initSoapAlumnoProxy();
    return soapAlumno.consultaAlumnmos(arg0);
  }
  
  
}