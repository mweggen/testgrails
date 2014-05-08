package cxf.client.demo

import com.cxf.demo.SimpleResponse
import org.grails.cxf.utils.EndpointType
import org.grails.cxf.utils.GrailsCxfEndpoint

@GrailsCxfEndpoint(expose = EndpointType.SIMPLE)
class SecureService {
    SimpleResponse secureMethod() {
        println "in secure Method"
        new SimpleResponse(isOld: false, status: "Secure Service")
    }
}
