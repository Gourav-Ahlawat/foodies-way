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

public final class ActivityBookingPageForButton01Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText BookerPhoneNumber;

  @NonNull
  public final EditText PersonsComing;

  @NonNull
  public final EditText bookerName;

  @NonNull
  public final TextView bookingDate;

  @NonNull
  public final TextView bookingDetailsHeading;

  @NonNull
  public final TextView bookingTime;

  @NonNull
  public final Button cancelBooking;

  @NonNull
  public final Button confirmBookingButton;

  @NonNull
  public final EditText dateOfBooking;

  @NonNull
  public final TextView nameOfBooker;

  @NonNull
  public final TextView numberOfPersons;

  @NonNull
  public final TextView phoneNumberOfBooker;

  @NonNull
  public final EditText timeOfBooking;

  private ActivityBookingPageForButton01Binding(@NonNull ConstraintLayout rootView,
      @NonNull EditText BookerPhoneNumber, @NonNull EditText PersonsComing,
      @NonNull EditText bookerName, @NonNull TextView bookingDate,
      @NonNull TextView bookingDetailsHeading, @NonNull TextView bookingTime,
      @NonNull Button cancelBooking, @NonNull Button confirmBookingButton,
      @NonNull EditText dateOfBooking, @NonNull TextView nameOfBooker,
      @NonNull TextView numberOfPersons, @NonNull TextView phoneNumberOfBooker,
      @NonNull EditText timeOfBooking) {
    this.rootView = rootView;
    this.BookerPhoneNumber = BookerPhoneNumber;
    this.PersonsComing = PersonsComing;
    this.bookerName = bookerName;
    this.bookingDate = bookingDate;
    this.bookingDetailsHeading = bookingDetailsHeading;
    this.bookingTime = bookingTime;
    this.cancelBooking = cancelBooking;
    this.confirmBookingButton = confirmBookingButton;
    this.dateOfBooking = dateOfBooking;
    this.nameOfBooker = nameOfBooker;
    this.numberOfPersons = numberOfPersons;
    this.phoneNumberOfBooker = phoneNumberOfBooker;
    this.timeOfBooking = timeOfBooking;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBookingPageForButton01Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBookingPageForButton01Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_booking_page_for_button01, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBookingPageForButton01Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Booker_phone_number;
      EditText BookerPhoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (BookerPhoneNumber == null) {
        break missingId;
      }

      id = R.id.Persons_coming;
      EditText PersonsComing = ViewBindings.findChildViewById(rootView, id);
      if (PersonsComing == null) {
        break missingId;
      }

      id = R.id.booker_name;
      EditText bookerName = ViewBindings.findChildViewById(rootView, id);
      if (bookerName == null) {
        break missingId;
      }

      id = R.id.booking_date;
      TextView bookingDate = ViewBindings.findChildViewById(rootView, id);
      if (bookingDate == null) {
        break missingId;
      }

      id = R.id.booking_details_heading;
      TextView bookingDetailsHeading = ViewBindings.findChildViewById(rootView, id);
      if (bookingDetailsHeading == null) {
        break missingId;
      }

      id = R.id.booking_time;
      TextView bookingTime = ViewBindings.findChildViewById(rootView, id);
      if (bookingTime == null) {
        break missingId;
      }

      id = R.id.cancel_booking;
      Button cancelBooking = ViewBindings.findChildViewById(rootView, id);
      if (cancelBooking == null) {
        break missingId;
      }

      id = R.id.confirm_booking_button;
      Button confirmBookingButton = ViewBindings.findChildViewById(rootView, id);
      if (confirmBookingButton == null) {
        break missingId;
      }

      id = R.id.date_of_booking;
      EditText dateOfBooking = ViewBindings.findChildViewById(rootView, id);
      if (dateOfBooking == null) {
        break missingId;
      }

      id = R.id.name_of_booker;
      TextView nameOfBooker = ViewBindings.findChildViewById(rootView, id);
      if (nameOfBooker == null) {
        break missingId;
      }

      id = R.id.number_of_persons;
      TextView numberOfPersons = ViewBindings.findChildViewById(rootView, id);
      if (numberOfPersons == null) {
        break missingId;
      }

      id = R.id.phone_number_of_booker;
      TextView phoneNumberOfBooker = ViewBindings.findChildViewById(rootView, id);
      if (phoneNumberOfBooker == null) {
        break missingId;
      }

      id = R.id.time_of_booking;
      EditText timeOfBooking = ViewBindings.findChildViewById(rootView, id);
      if (timeOfBooking == null) {
        break missingId;
      }

      return new ActivityBookingPageForButton01Binding((ConstraintLayout) rootView,
          BookerPhoneNumber, PersonsComing, bookerName, bookingDate, bookingDetailsHeading,
          bookingTime, cancelBooking, confirmBookingButton, dateOfBooking, nameOfBooker,
          numberOfPersons, phoneNumberOfBooker, timeOfBooking);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
