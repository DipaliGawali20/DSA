public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        // character access
        System.out.println(sb.charAt(0)); // h
        // set char at index
        sb.setCharAt(0, 'P');
        System.out.println(sb); // Pello
        // to insert char
        sb.insert(0, 'S');
        System.out.println(sb); // SPello
        // to delete char or substring
        sb.delete(2, 3);
        System.out.println(sb); // SPllo

        // to append
        StringBuilder s = new StringBuilder('h');
        s.append('e');
        s.append('l');
        s.append('l');
        s.append('o');
        System.out.println(s); // hello

    }
}
