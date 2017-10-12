package grails.cas.encoding

class ApplicationController {

    def index() {
        render text: "string: ${params.string}\n"
    }
}
