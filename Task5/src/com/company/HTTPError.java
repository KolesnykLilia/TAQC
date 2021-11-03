package com.company;

import java.util.Scanner;

public class HTTPError {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        enum HTTPerror {
            BAD_REQUEST(400),
            UNAUTHORIZED(401),
            PAYMENT_REQUIRED(402),
            FORBIDDEN(403),
            NOT_FOUND(404),
            METHOD_NOT_ALLOWED(405);
            public int errorCode;

            HTTPerror(int errorCode) {
                this.errorCode = errorCode;
            }

            public int getError() {
                return errorCode;
            }
        }

        System.out.println("Enter number HTTP error:");
        int error = in.nextInt();

        for (HTTPerror e : HTTPerror.values()) {
            if (error == e.getError()) {
                System.out.println("Your error: " + e);
            }
            else{
                System.out.println("Invalid error number! ");
            }
        }
    }
}
