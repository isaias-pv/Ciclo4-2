// Generated by view binder compiler. Do not edit!
package com.retos.r1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.retos.r1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProductBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageProduct;

  @NonNull
  public final ImageView imageProduct1;

  @NonNull
  public final ImageView imageProduct2;

  @NonNull
  public final ImageView imageProduct3;

  @NonNull
  public final ImageView imageViewProduct;

  @NonNull
  public final TextView textViewProduct;

  @NonNull
  public final TextView textViewProduct1;

  @NonNull
  public final TextView textViewProduct2;

  @NonNull
  public final TextView textViewProduct3;

  @NonNull
  public final TextView textViewProductDes;

  @NonNull
  public final TextView textViewProductDes1;

  @NonNull
  public final TextView textViewProductDes2;

  @NonNull
  public final TextView textViewProductDes3;

  private FragmentProductBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageProduct,
      @NonNull ImageView imageProduct1, @NonNull ImageView imageProduct2,
      @NonNull ImageView imageProduct3, @NonNull ImageView imageViewProduct,
      @NonNull TextView textViewProduct, @NonNull TextView textViewProduct1,
      @NonNull TextView textViewProduct2, @NonNull TextView textViewProduct3,
      @NonNull TextView textViewProductDes, @NonNull TextView textViewProductDes1,
      @NonNull TextView textViewProductDes2, @NonNull TextView textViewProductDes3) {
    this.rootView = rootView;
    this.imageProduct = imageProduct;
    this.imageProduct1 = imageProduct1;
    this.imageProduct2 = imageProduct2;
    this.imageProduct3 = imageProduct3;
    this.imageViewProduct = imageViewProduct;
    this.textViewProduct = textViewProduct;
    this.textViewProduct1 = textViewProduct1;
    this.textViewProduct2 = textViewProduct2;
    this.textViewProduct3 = textViewProduct3;
    this.textViewProductDes = textViewProductDes;
    this.textViewProductDes1 = textViewProductDes1;
    this.textViewProductDes2 = textViewProductDes2;
    this.textViewProductDes3 = textViewProductDes3;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageProduct;
      ImageView imageProduct = ViewBindings.findChildViewById(rootView, id);
      if (imageProduct == null) {
        break missingId;
      }

      id = R.id.imageProduct1;
      ImageView imageProduct1 = ViewBindings.findChildViewById(rootView, id);
      if (imageProduct1 == null) {
        break missingId;
      }

      id = R.id.imageProduct2;
      ImageView imageProduct2 = ViewBindings.findChildViewById(rootView, id);
      if (imageProduct2 == null) {
        break missingId;
      }

      id = R.id.imageProduct3;
      ImageView imageProduct3 = ViewBindings.findChildViewById(rootView, id);
      if (imageProduct3 == null) {
        break missingId;
      }

      id = R.id.imageViewProduct;
      ImageView imageViewProduct = ViewBindings.findChildViewById(rootView, id);
      if (imageViewProduct == null) {
        break missingId;
      }

      id = R.id.textViewProduct;
      TextView textViewProduct = ViewBindings.findChildViewById(rootView, id);
      if (textViewProduct == null) {
        break missingId;
      }

      id = R.id.textViewProduct1;
      TextView textViewProduct1 = ViewBindings.findChildViewById(rootView, id);
      if (textViewProduct1 == null) {
        break missingId;
      }

      id = R.id.textViewProduct2;
      TextView textViewProduct2 = ViewBindings.findChildViewById(rootView, id);
      if (textViewProduct2 == null) {
        break missingId;
      }

      id = R.id.textViewProduct3;
      TextView textViewProduct3 = ViewBindings.findChildViewById(rootView, id);
      if (textViewProduct3 == null) {
        break missingId;
      }

      id = R.id.textViewProductDes;
      TextView textViewProductDes = ViewBindings.findChildViewById(rootView, id);
      if (textViewProductDes == null) {
        break missingId;
      }

      id = R.id.textViewProductDes1;
      TextView textViewProductDes1 = ViewBindings.findChildViewById(rootView, id);
      if (textViewProductDes1 == null) {
        break missingId;
      }

      id = R.id.textViewProductDes2;
      TextView textViewProductDes2 = ViewBindings.findChildViewById(rootView, id);
      if (textViewProductDes2 == null) {
        break missingId;
      }

      id = R.id.textViewProductDes3;
      TextView textViewProductDes3 = ViewBindings.findChildViewById(rootView, id);
      if (textViewProductDes3 == null) {
        break missingId;
      }

      return new FragmentProductBinding((LinearLayout) rootView, imageProduct, imageProduct1,
          imageProduct2, imageProduct3, imageViewProduct, textViewProduct, textViewProduct1,
          textViewProduct2, textViewProduct3, textViewProductDes, textViewProductDes1,
          textViewProductDes2, textViewProductDes3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
