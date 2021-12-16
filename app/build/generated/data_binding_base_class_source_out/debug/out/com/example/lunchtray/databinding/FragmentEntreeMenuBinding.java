// Generated by data binding compiler. Do not edit!
package com.example.lunchtray.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.lunchtray.R;
import com.example.lunchtray.model.OrderViewModel;
import com.example.lunchtray.ui.order.EntreeMenuFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentEntreeMenuBinding extends ViewDataBinding {
  @NonNull
  public final Button cancelButton;

  @NonNull
  public final RadioButton cauliflower;

  @NonNull
  public final TextView cauliflowerDescription;

  @NonNull
  public final TextView cauliflowerPrice;

  @NonNull
  public final RadioButton chili;

  @NonNull
  public final TextView chiliDescription;

  @NonNull
  public final TextView chiliPrice;

  @NonNull
  public final View divider;

  @NonNull
  public final RadioGroup entreeOptions;

  @NonNull
  public final Button nextButton;

  @NonNull
  public final RadioButton pasta;

  @NonNull
  public final TextView pastaDescription;

  @NonNull
  public final TextView pastaPrice;

  @NonNull
  public final RadioButton skillet;

  @NonNull
  public final TextView skilletDescription;

  @NonNull
  public final TextView skilletPrice;

  @NonNull
  public final TextView subtotal;

  @Bindable
  protected OrderViewModel mViewModel;

  @Bindable
  protected EntreeMenuFragment mEntree;

  protected FragmentEntreeMenuBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button cancelButton, RadioButton cauliflower, TextView cauliflowerDescription,
      TextView cauliflowerPrice, RadioButton chili, TextView chiliDescription, TextView chiliPrice,
      View divider, RadioGroup entreeOptions, Button nextButton, RadioButton pasta,
      TextView pastaDescription, TextView pastaPrice, RadioButton skillet,
      TextView skilletDescription, TextView skilletPrice, TextView subtotal) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cancelButton = cancelButton;
    this.cauliflower = cauliflower;
    this.cauliflowerDescription = cauliflowerDescription;
    this.cauliflowerPrice = cauliflowerPrice;
    this.chili = chili;
    this.chiliDescription = chiliDescription;
    this.chiliPrice = chiliPrice;
    this.divider = divider;
    this.entreeOptions = entreeOptions;
    this.nextButton = nextButton;
    this.pasta = pasta;
    this.pastaDescription = pastaDescription;
    this.pastaPrice = pastaPrice;
    this.skillet = skillet;
    this.skilletDescription = skilletDescription;
    this.skilletPrice = skilletPrice;
    this.subtotal = subtotal;
  }

  public abstract void setViewModel(@Nullable OrderViewModel viewModel);

  @Nullable
  public OrderViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setEntree(@Nullable EntreeMenuFragment entree);

  @Nullable
  public EntreeMenuFragment getEntree() {
    return mEntree;
  }

  @NonNull
  public static FragmentEntreeMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_entree_menu, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEntreeMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentEntreeMenuBinding>inflateInternal(inflater, R.layout.fragment_entree_menu, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEntreeMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_entree_menu, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEntreeMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentEntreeMenuBinding>inflateInternal(inflater, R.layout.fragment_entree_menu, null, false, component);
  }

  public static FragmentEntreeMenuBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentEntreeMenuBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentEntreeMenuBinding)bind(component, view, R.layout.fragment_entree_menu);
  }
}
