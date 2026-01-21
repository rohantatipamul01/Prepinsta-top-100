

class DecimalToHex {
    public static void main(String[] args) {

        int n = 1457;
        System.out.println(hexa(n));
    }

    static String hexa(int n) {
        int decimal = n;
        String req = "123456789ABCDEF";
        StringBuilder hexa = new StringBuilder();
        while (n > 16) {
            hexa.append(req.charAt((n % 16) - 1));
            n /= 16;
        }
        hexa.append(n);
        return "Decimal : " + decimal + "== HexaDecimal : " + hexa.reverse().toString();
    }
}

