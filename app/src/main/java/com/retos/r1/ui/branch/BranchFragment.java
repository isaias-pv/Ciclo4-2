package com.retos.r1.ui.branch;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.retos.r1.databinding.FragmentBranchBinding;

public class BranchFragment extends Fragment{

    private BranchViewModel branchViewModel;
    private FragmentBranchBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        branchViewModel =
                new ViewModelProvider(this).get(BranchViewModel.class);

        binding = FragmentBranchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        TextView textView = binding.textBranch;

        Intent intent = getActivity().getIntent();
        textView.setText("Nombre Cliente: " + intent.getStringExtra("client"));

        return root;
    }

}