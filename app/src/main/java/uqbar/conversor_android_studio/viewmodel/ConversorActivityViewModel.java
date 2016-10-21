package uqbar.conversor_android_studio.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.android.databinding.library.baseAdapters.BR;

import java.util.Observable;

import uqbar.conversor_android_studio.model.Conversor;

public class ConversorActivityViewModel extends BaseObservable {
    private Conversor conversor = new Conversor();

    public ConversorActivityViewModel(double millas) {
        this.setMillas(millas+"");
    }
    @Bindable
    public String getMillas() {return  conversor.getMillas()+"";   }

    public void setMillas(String millas) {
        conversor.setMillas(Double.parseDouble(millas));
        conversor.convertir();
        notifyPropertyChanged(BR.kilometros);
    }

    @Bindable
    public String getKilometros() {return  conversor.getKilometros()+"";   }

    public void setKilometros(String kilometros) {
        conversor.setKilometros(Double.parseDouble(kilometros));
        notifyPropertyChanged(BR.millas);
    }
}
