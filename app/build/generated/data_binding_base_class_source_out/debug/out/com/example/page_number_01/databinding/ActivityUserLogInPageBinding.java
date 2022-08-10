// Generated by view binder compiler. Do not edit!
package com.example.page_number_01.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.page_number_01.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUserLogInPageBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final ImageView ImageViewForBackground;

  @NonNull
  public final TextView TextViewSignUp;

  @NonNull
  public final TextInputLayout UserLoginView;

  @NonNull
  public final TextInputEditText UserLoginViewEditText;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final TextView forgetPassword;

  @NonNull
  public final Button signInButton;

  @NonNull
  public final TextView textSignInMassage;

  private ActivityUserLogInPageBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull ImageView ImageViewForBackground, @NonNull TextView TextViewSignUp,
      @NonNull TextInputLayout UserLoginView, @NonNull TextInputEditText UserLoginViewEditText,
      @NonNull EditText etPassword, @NonNull TextView forgetPassword, @NonNull Button signInButton,
      @NonNull TextView textSignInMassage) {
    this.rootView = rootView;
    this.ImageViewForBackground = ImageViewForBackground;
    this.TextViewSignUp = TextViewSignUp;
    this.UserLoginView = UserLoginView;
    this.UserLoginViewEditText = UserLoginViewEditText;
    this.etPassword = etPassword;
    this.forgetPassword = forgetPassword;
    this.signInButton = signInButton;
    this.textSignInMassage = textSignInMassage;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUserLogInPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUserLogInPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_user_log_in_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUserLogInPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Image_view_for_background;
      ImageView ImageViewForBackground = ViewBindings.findChildViewById(rootView, id);
      if (ImageViewForBackground == null) {
        break missingId;
      }

      id = R.id._text_view_sign_up;
      TextView TextViewSignUp = ViewBindings.findChildViewById(rootView, id);
      if (TextViewSignUp == null) {
        break missingId;
      }

      id = R.id.User_login_view;
      TextInputLayout UserLoginView = ViewBindings.findChildViewById(rootView, id);
      if (UserLoginView == null) {
        break missingId;
      }

      id = R.id.User_login_view_edit_text;
      TextInputEditText UserLoginViewEditText = ViewBindings.findChildViewById(rootView, id);
      if (UserLoginViewEditText == null) {
        break missingId;
      }

      id = R.id.et_password;
      EditText etPassword = ViewBindings.findChildViewById(rootView, id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.forget_password;
      TextView forgetPassword = ViewBindings.findChildViewById(rootView, id);
      if (forgetPassword == null) {
        break missingId;
      }

      id = R.id.sign_in_button;
      Button signInButton = ViewBindings.findChildViewById(rootView, id);
      if (signInButton == null) {
        break missingId;
      }

      id = R.id.text_sign_in_massage;
      TextView textSignInMassage = ViewBindings.findChildViewById(rootView, id);
      if (textSignInMassage == null) {
        break missingId;
      }

      return new ActivityUserLogInPageBinding((LinearLayoutCompat) rootView, ImageViewForBackground,
          TextViewSignUp, UserLoginView, UserLoginViewEditText, etPassword, forgetPassword,
          signInButton, textSignInMassage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
