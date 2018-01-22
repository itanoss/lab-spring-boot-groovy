package kr.itanoss.lab.springbootgroovy.controllers

import kr.itanoss.lab.springbootgroovy.controllers.json.RequestJson
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/")
    def index() {
        "Hello, world!"
    }

    @GetMapping("/response-json")
    def responseJsonExample() {
        [
                id: UUID.randomUUID().toString(),
                status: "OK",
                number: 123
        ]
    }

    @GetMapping("/with/{param}")
    def pathVariableExample(@PathVariable param) {
        [
                status: "OK",
                param: param
        ]
    }

    @PostMapping("/request-json")
    def requestJsonExample(@RequestBody RequestJson param) {
        [
                status: "OK",
                param: param
        ]
    }
}
