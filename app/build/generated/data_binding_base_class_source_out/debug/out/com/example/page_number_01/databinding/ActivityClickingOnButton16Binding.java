// Generated by view binder compiler. Do not edit!
package com.example.page_number_01.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.page_number_01.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityClickingOnButton16Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView17;

  private ActivityClickingOnButton16Binding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView17) {
    this.rootView = rootView;
    this.imageView17 = imageView17;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityClickingOnButton16Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityClickingOnButton16Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_clicking_on_button16, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityClickingOnButton16Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView17;
      ImageView imageView17 = ViewBindings.findChildViewById(rootView, id);
      if (imageView17 == null) {
        break missingId;
      }

      return new ActivityClickingOnButton16Binding((ConstraintLayout) rootView, imageView17);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
