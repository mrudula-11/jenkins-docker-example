package com.mycompany.app;

/**
 * Hello world!
 *
 */
@RestController
public class App 
{
    @GetMapping("/hello")
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
