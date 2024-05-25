package core.controllers.utils;

/**
 *
 * @author andre
 */
public class ResponseShared {

    private static final OperationShared dc = new OperationShared();

    public static Response responseType1(String a, String b) {

        try {
            if (a.equals("")) {
                return new Response("Number 1 must be not empty", Status.BAD_REQUEST);
            }
            try {
                Double.parseDouble(a);
            } catch (NumberFormatException ex) {
                return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
            }
            if (!dc.isValid(a)) {
                return new Response("Number 1 has more than 3 decimals", Status.BAD_REQUEST);
            }

            if (b.equals("")) {
                return new Response("Number 2 must be not empty", Status.BAD_REQUEST);
            }
            try {
                Double.parseDouble(b);
            } catch (NumberFormatException ex) {
                return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
            }
            if (!dc.isValid(b)) {
                return new Response("Number 2 has more than 3 decimals", Status.BAD_REQUEST);
            }
            return new Response("Operation realized succesfully", Status.OK);
        } catch (NumberFormatException ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static Response responseType2(String a, String b) {
        try {

            if (a.equals("")) {
                return new Response("Number 1 must be not empty", Status.BAD_REQUEST);
            }
            try {
                Double.parseDouble(a);
            } catch (NumberFormatException ex) {
                return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
            }
            if (!dc.isValid(a)) {
                return new Response("Number 1 has more than 3 decimals", Status.BAD_REQUEST);
            }

            if (b.equals("")) {
                return new Response("Number 2 must be not empty", Status.BAD_REQUEST);
            }
            if (b.equals("0")) {
                return new Response("You cannot divide between cero", Status.BAD_REQUEST);
            }
            try {
                Double.parseDouble(b);
            } catch (NumberFormatException ex) {
                return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
            }
            if (!dc.isValid(b)) {
                return new Response("Number 2 has more than 3 decimals", Status.BAD_REQUEST);
            }
            return new Response("Operation realized succesfully", Status.CREATED);
        } catch (NumberFormatException ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
