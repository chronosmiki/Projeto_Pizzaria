package ClassesAuxiliares;

import java.text.DecimalFormat;
import java.util.Locale;

public class FormataDouble {
    /*
        Metodo para formatar valores monetários..
        Esse metodo so deve ser usado para retorno final, impressoes em caixa de texto, relatorios e afins..
        Nao usar esse metodo antes de fazer contas ou no meio delas, o metodo transforma numeros, doubles em STRING!!!
    */
    public String format(Double x)
    {
        DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
        return df.format(x);
    }
    
}
