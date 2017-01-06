package pl.pionwit.cameco.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.pionwit.cameco.R;

/**
 * Created by vi_st on 06.01.2017.
 * Класс описывающий фрагмент добавляющий картинки в приложение
 */

public class FragmentDataAddImage extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_image,container,false);
    }
}
