public abstract class Usuario {
    private String nombreUsuario;
    private int NIP;
    

    public Usuario(String nombreUsuario, int NIP) {
        this.nombreUsuario = nombreUsuario;
        this.NIP = NIP;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int nIP) {
        NIP = nIP;
    }
    public static boolean ChecarNip(int NIP) {
        if(String.valueOf(NIP).length() == 4){
            return true;
        }
        else{
            return false;
        }
}
}
