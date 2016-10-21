package uqbar.conversor_android_studio;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import uqbar.conversor_android_studio.databinding.ConversorActivityBinding;
import uqbar.conversor_android_studio.model.Conversor;
import uqbar.conversor_android_studio.viewmodel.ConversorActivityViewModel;


public class ConversorActivity extends Activity  {

        private Conversor conversor = new Conversor();

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            ConversorActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.conversor_activity);
            ConversorActivityViewModel viewModel = new ConversorActivityViewModel(10);
            binding.setVm(viewModel);

        }

}
