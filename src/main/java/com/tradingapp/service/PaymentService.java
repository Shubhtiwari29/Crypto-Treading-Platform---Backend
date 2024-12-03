package com.tradingapp.service;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.tradingapp.domain.PaymentMethod;
import com.tradingapp.model.PaymentOrder;
import com.tradingapp.model.User;
import com.tradingapp.response.PaymentResponse;

public interface PaymentService {

    PaymentOrder createOrder(User user, Long amount, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    Boolean ProccedPaymentOrder (PaymentOrder paymentOrder,
                                 String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLink(User user,
                                              Long Amount,
                                              Long orderId) throws RazorpayException;

    PaymentResponse createStripePaymentLink(User user, Long Amount,
                                            Long orderId) throws StripeException;
}
