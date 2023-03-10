import java.time.LocalDateTime;
import java.util.Date;

public class IslaiduIrasas{
    public int islaiduSuma;
    private int IslaiduSuma;
    private String dateTime;
    private int kategorijosIndeksas;
    private String kortele;
    private String papildomaInfo;

    public IslaiduIrasas(int suma, String dateTime, int kategorijosIndeksas, String kortele, String papildomaInfo) {
        this.IslaiduSuma = suma;
        this.dateTime = dateTime;
        this.kategorijosIndeksas = kategorijosIndeksas;
        this.kortele = kortele;
        this.papildomaInfo = papildomaInfo;
    }

    @Override
    public String toString() {
        return "Islaidu Irasas:" +
                "suma=" + IslaiduSuma +
                ", dateTime='" + dateTime + '\'' +
                ", kategorija=" + kategorijosIndeksas + '\'' +
                ", kortele='" + kortele + '\'' +
                ", papildomaInfo='" + papildomaInfo + '\'';
    }
}
