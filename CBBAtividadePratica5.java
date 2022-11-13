class CBBAtividadePratica5 {
    public static void main(String[] args) {
        String dias[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta","Sábado", "Domingo"};

        int i = 0;
        while(i < dias.length) {
            System.out.println(dias[i]);
            i++;
        }

        i = 0;
        do {
            System.out.println(dias[i]);
            i++;
        }while(i < dias.length);

        for (int j = 0; j < dias.length; j++) {
            System.out.println(dias[j]);
        }
    }
}