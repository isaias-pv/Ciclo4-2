package com.retos.r1.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.retos.r1.MainActivity;
import com.retos.r1.R;
import com.retos.r1.databinding.FragmentHomeBinding;
import com.retos.r1.ui.branch.BranchFragment;
import com.retos.r1.ui.classes.Client;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        final Button btnSend = binding.btnSend;
        final EditText inputName = binding.inputName;

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Client client = new Client();
                String name = inputName.getText().toString();
                client.setName(name.equals("") ? "Sin Nombre" : name);
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("client", client.getName());
                startActivity(intent);
            }

        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}