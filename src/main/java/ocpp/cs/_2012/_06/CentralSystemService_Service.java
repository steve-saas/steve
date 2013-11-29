
/*
 * 
 */

package ocpp.cs._2012._06;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Sep 18 16:10:03 CEST 2013
 * Generated source version: 2.3.1
 * 
 */


@WebServiceClient(name = "CentralSystemService", 
                  wsdlLocation = "file:/Users/sgokay/git/steve/src/main/webapp/wsdl/ocpp_centralsystemservice_1.5_final.wsdl",
                  targetNamespace = "urn://Ocpp/Cs/2012/06/") 
public class CentralSystemService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn://Ocpp/Cs/2012/06/", "CentralSystemService");
    public final static QName CentralSystemServiceSoap12 = new QName("urn://Ocpp/Cs/2012/06/", "CentralSystemServiceSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/sgokay/git/steve/src/main/webapp/wsdl/ocpp_centralsystemservice_1.5_final.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/Users/sgokay/git/steve/src/main/webapp/wsdl/ocpp_centralsystemservice_1.5_final.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public CentralSystemService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CentralSystemService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CentralSystemService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CentralSystemService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }
    public CentralSystemService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CentralSystemService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CentralSystemService
     */
    @WebEndpoint(name = "CentralSystemServiceSoap12")
    public CentralSystemService getCentralSystemServiceSoap12() {
        return super.getPort(CentralSystemServiceSoap12, CentralSystemService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CentralSystemService
     */
    @WebEndpoint(name = "CentralSystemServiceSoap12")
    public CentralSystemService getCentralSystemServiceSoap12(WebServiceFeature... features) {
        return super.getPort(CentralSystemServiceSoap12, CentralSystemService.class, features);
    }

}
