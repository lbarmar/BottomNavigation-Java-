package dam.pmdm.bottomnavigationjava;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import dam.pmdm.bottomnavigationjava.databinding.FragmentWorldBinding;

public class WorldFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        FragmentWorldBinding binding = FragmentWorldBinding.inflate(inflater, container, false);

        binding.detailWorld1Button.setOnClickListener(this::changeToDetailWorldView);

        return binding.getRoot();
    }

    private void changeToDetailWorldView(View view) {
        Navigation.findNavController(view).navigate(R.id.detailWorldFragment);
    }
}
