package cxf.client.demo

import com.cxf.demo.SimpleRequest
import com.cxf.demo.SimpleResponse
import org.grails.cxf.utils.EndpointType
import org.grails.cxf.utils.GrailsCxfEndpoint

@GrailsCxfEndpoint(expose = EndpointType.SIMPLE)
class SimpleService {

    static transactional = false

    SimpleResponse simpleMethod1(SimpleRequest request) {
        new SimpleResponse(isOld: request?.age > 100, status: "${request.name} was judged by a normal person")
    }

    SimpleResponse simpleMethod2(SimpleRequest request) {
        new SimpleResponse(isOld: request?.age > 25, status: "${request.name} was judged by a young person")
    }

}
