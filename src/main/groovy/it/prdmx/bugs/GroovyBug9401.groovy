package it.prdmx.bugs

import groovy.json.JsonOutput
import groovy.transform.CompileStatic

@CompileStatic
class GroovyBug9401 {

    static void main(String... args) {
        String s = JsonOutput.prettyPrint('{"id":123}')
        println s.getBytes().encodeHex().toString()
        println s
    }
}
