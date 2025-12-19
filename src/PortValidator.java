public class PortValidator {


    public static Boolean isValid(String ip) {
        return isValidIPv4(ip) || isValidIPv6(ip);
    };

    public static boolean isValidIPv4(String ip) {
        if (ip == null) return false;
        String regex =
                "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)"
                        + "(\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)){3}$";
        return ip.matches(regex);
    }

    public static boolean isValidIPv6(String ip) {
        if (ip == null) return false;
        String regex =
                "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$"
                        + "|^(?:[0-9a-fA-F]{1,4}:){1,7}:$"
                        + "|^:(?::[0-9a-fA-F]{1,4}){1,7}$"
                        + "|^(?:[0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}$"
                        + "|^(?:[0-9a-fA-F]{1,4}:){1,5}(?::[0-9a-fA-F]{1,4}){1,2}$"
                        + "|^(?:[0-9a-fA-F]{1,4}:){1,4}(?::[0-9a-fA-F]{1,4}){1,3}$"
                        + "|^(?:[0-9a-fA-F]{1,4}:){1,3}(?::[0-9a-fA-F]{1,4}){1,4}$"
                        + "|^(?:[0-9a-fA-F]{1,4}:){1,2}(?::[0-9a-fA-F]{1,4}){1,5}$"
                        + "|^[0-9a-fA-F]{1,4}:(?::[0-9a-fA-F]{1,4}){1,6}$"
                        + "|^:(?::[0-9a-fA-F]{1,4}){1,7}$";
        return ip.matches(regex);
    }

}
