package sample.javaee.jpa.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class MyRollbackException extends Exception {
}
