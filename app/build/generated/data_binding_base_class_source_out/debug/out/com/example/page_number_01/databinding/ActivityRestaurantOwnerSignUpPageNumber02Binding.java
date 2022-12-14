// Generated by view binder compiler. Do not edit!
package com.example.page_number_01.databinding;

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
import com.example.page_number_01.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRestaurantOwnerSignUpPageNumber02Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button ButtonForSignUp;

  @NonNull
  public final EditText EditTextForAddress;

  @NonNull
  public final EditText EditTextForEmail;

  @NonNull
  public final EditText EditTextForFSSAICode;

  @NonNull
  public final EditText EditTextForPhoneNumber;

  @NonNull
  public final TextView TextViewForAgreementMassage;

  @NonNull
  public final TextView textViewMassage;

  private ActivityRestaurantOwnerSignUpPageNumber02Binding(@NonNull ConstraintLayout rootView,
      @NonNull Button ButtonForSignUp, @NonNull EditText EditTextForAddress,
      @NonNull EditText EditTextForEmail, @NonNull EditText EditTextForFSSAICode,
      @NonNull EditText EditTextForPhoneNumber, @NonNull TextView TextViewForAgreementMassage,
      @NonNull TextView textViewMassage) {
    this.rootView = rootView;
    this.ButtonForSignUp = ButtonForSignUp;
    this.EditTextForAddress = EditTextForAddress;
    this.EditTextForEmail = EditTextForEmail;
    this.EditTextForFSSAICode = EditTextForFSSAICode;
    this.EditTextForPhoneNumber = EditTextForPhoneNumber;
    this.TextViewForAgreementMassage = TextViewForAgreementMassage;
    this.textViewMassage = textViewMassage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRestaurantOwnerSignUpPageNumber02Binding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRestaurantOwnerSignUpPageNumber02Binding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_restaurant_owner_sign_up_page_number02, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRestaurantOwnerSignUpPageNumber02Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Button_for_sign_up;
      Button ButtonForSignUp = ViewBindings.findChildViewById(rootView, id);
      if (ButtonForSignUp == null) {
        break missingId;
      }

      id = R.id.Edit_text_for_Address;
      EditText EditTextForAddress = ViewBindings.findChildViewById(rootView, id);
      if (EditTextForAddress == null) {
        break missingId;
      }

      id = R.id.Edit_text_for_Email;
      EditText EditTextForEmail = ViewBindings.findChildViewById(rootView, id);
      if (EditTextForEmail == null) {
        break missingId;
      }

      id = R.id.Edit_text_for_FSSAI_code;
      EditText EditTextForFSSAICode = ViewBindings.findChildViewById(rootView, id);
      if (EditTextForFSSAICode == null) {
        break missingId;
      }

      id = R.id.Edit_text_for_phone_number;
      EditText EditTextForPhoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (EditTextForPhoneNumber == null) {
        break missingId;
      }

      id = R.id.Text_view_for_agreement_massage;
      TextView TextViewForAgreementMassage = ViewBindings.findChildViewById(rootView, id);
      if (TextViewForAgreementMassage == null) {
        break missingId;
      }

      id = R.id.text_view_massage;
      TextView textViewMassage = ViewBindings.findChildViewById(rootView, id);
      if (textViewMassage == null) {
        break missingId;
      }

      return new ActivityRestaurantOwnerSignUpPageNumber02Binding((ConstraintLayout) rootView,
          ButtonForSignUp, EditTextForAddress, EditTextForEmail, EditTextForFSSAICode,
          EditTextForPhoneNumber, TextViewForAgreementMassage, textViewMassage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
