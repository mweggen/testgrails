package cxf.client.demo.secure;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2014-05-08T22:45:29.442+02:00
 * Generated source version: 2.6.2
 * 
 */
@WebServiceClient(name = "SecureService", 
                  wsdlLocation = "docs/SecureService.wsdl",
                  targetNamespace = "http://demo.client.cxf/") 
public class SecureService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://demo.client.cxf/", "SecureService");
    public final static QName SecureServicePort = new QName("http://demo.client.cxf/", "SecureServicePort");
    static {
        URL url = SecureService.class.getResource("docs/SecureService.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(SecureService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "docs/SecureService.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public SecureService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SecureService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SecureService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SecureService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SecureService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SecureService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns SecureServicePortType
     */
    @WebEndpoint(name = "SecureServicePort")
    public SecureServicePortType getSecureServicePort() {
        return super.getPort(SecureServicePort, SecureServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SecureServicePortType
     */
    @WebEndpoint(name = "SecureServicePort")
    public SecureServicePortType getSecureServicePort(WebServiceFeature... features) {
        return super.getPort(SecureServicePort, SecureServicePortType.class, features);
    }

}
