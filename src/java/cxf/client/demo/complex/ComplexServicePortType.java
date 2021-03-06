package cxf.client.demo.complex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2014-05-08T22:45:29.089+02:00
 * Generated source version: 2.6.2
 * 
 */
@WebService(targetNamespace = "http://demo.client.cxf/", name = "ComplexServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface ComplexServicePortType {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "complexMethod3", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.complex.ComplexMethod3")
    @WebMethod
    @ResponseWrapper(localName = "complexMethod3Response", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.complex.ComplexMethod3Response")
    public cxf.client.demo.complex.ComplexResponse complexMethod3(
        @WebParam(name = "request", targetNamespace = "")
        cxf.client.demo.complex.ComplexRequest request
    ) throws ComplexContrivedException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "complexMethod1", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.complex.ComplexMethod1")
    @WebMethod
    @ResponseWrapper(localName = "complexMethod1Response", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.complex.ComplexMethod1Response")
    public cxf.client.demo.complex.ComplexResponse complexMethod1(
        @WebParam(name = "request", targetNamespace = "")
        cxf.client.demo.complex.ComplexRequest request
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "complexMethod2", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.complex.ComplexMethod2")
    @WebMethod
    @ResponseWrapper(localName = "complexMethod2Response", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.complex.ComplexMethod2Response")
    public cxf.client.demo.complex.ComplexResponse complexMethod2(
        @WebParam(name = "request", targetNamespace = "")
        cxf.client.demo.complex.ComplexRequest request
    );
}
