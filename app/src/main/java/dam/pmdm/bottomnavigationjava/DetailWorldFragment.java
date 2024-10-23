package dam.pmdm.bottomnavigationjava;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import dam.pmdm.bottomnavigationjava.databinding.FragmentDetailWorldBinding;

public class DetailWorldFragment extends Fragment {

    private FragmentDetailWorldBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDetailWorldBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
        // Mostrar la ActionBar
        ActionBar actionBar = ((AppCompatActivity) requireActivity()).getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("");
            actionBar.show();
            actionBar.setDisplayHomeAsUpEnabled(true); // Mostrar el botón "Atrás"
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        // Ocultar la ActionBar si no estamos en este Fragment
        ActionBar actionBar = ((AppCompatActivity) requireActivity()).getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }
}
