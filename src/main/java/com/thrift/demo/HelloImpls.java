package com.thrift.demo;

/**
 * Created by Jtao on 10/9/16.
 */
public class HelloImpls implements HelloService.Iface {

    public HelloImpls() {
    }

    @Override
    public String sayHello(String username) {
        return "Hi," + username + " ,Welcome to the thrift's world !";
    }

}