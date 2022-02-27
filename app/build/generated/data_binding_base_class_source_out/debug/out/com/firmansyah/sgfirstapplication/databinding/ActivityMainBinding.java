// Generated by view binder compiler. Do not edit!
package com.firmansyah.sgfirstapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.firmansyah.sgfirstapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnHitung;

  @NonNull
  public final Button btnKurang;

  @NonNull
  public final Button btnTambah;

  @NonNull
  public final EditText edtKedua;

  @NonNull
  public final EditText edtPertama;

  @NonNull
  public final TextView tvHasil;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnHitung,
      @NonNull Button btnKurang, @NonNull Button btnTambah, @NonNull EditText edtKedua,
      @NonNull EditText edtPertama, @NonNull TextView tvHasil) {
    this.rootView = rootView;
    this.btnHitung = btnHitung;
    this.btnKurang = btnKurang;
    this.btnTambah = btnTambah;
    this.edtKedua = edtKedua;
    this.edtPertama = edtPertama;
    this.tvHasil = tvHasil;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnHitung;
      Button btnHitung = ViewBindings.findChildViewById(rootView, id);
      if (btnHitung == null) {
        break missingId;
      }

      id = R.id.btnKurang;
      Button btnKurang = ViewBindings.findChildViewById(rootView, id);
      if (btnKurang == null) {
        break missingId;
      }

      id = R.id.btnTambah;
      Button btnTambah = ViewBindings.findChildViewById(rootView, id);
      if (btnTambah == null) {
        break missingId;
      }

      id = R.id.edtKedua;
      EditText edtKedua = ViewBindings.findChildViewById(rootView, id);
      if (edtKedua == null) {
        break missingId;
      }

      id = R.id.edtPertama;
      EditText edtPertama = ViewBindings.findChildViewById(rootView, id);
      if (edtPertama == null) {
        break missingId;
      }

      id = R.id.tvHasil;
      TextView tvHasil = ViewBindings.findChildViewById(rootView, id);
      if (tvHasil == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnHitung, btnKurang, btnTambah,
          edtKedua, edtPertama, tvHasil);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
