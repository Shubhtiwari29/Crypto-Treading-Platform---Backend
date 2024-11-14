This backend application powers a feature-rich cryptocurrency trading platform, offering a robust and secure environment for crypto transactions, 
portfolio management, wallet operations, and AI-driven insights. 
Developed with Spring Boot, it integrates a powerful set of APIs and payment gateways to provide real-time data and support for various crypto-related activities.

# Key Features
1) AI Chat Bot
2) Real-time Data: Provides instant answers to crypto queries such as current values and market data.
3) Gemini and CoinGecko APIs: Utilizes these APIs to fetch accurate, real-time cryptocurrency data.
4) Buy & Sell Crypto
5) Smooth Transactions: Facilitates buying and selling of multiple cryptocurrencies with ease.
6) Comprehensive Coin Search: Allows users to search and gather information on various cryptocurrencies for informed trading.
7) Authentication and Security
8) User Authentication: Simple registration and login functionality.
9) Two-Factor Authentication: Adds an extra layer of security.
10) Password Recovery: Easy-to-use password recovery.

# Portfolio Management
1) Investment Tracking: Allows users to monitor their crypto investments and track performance within the platform.
2) Advanced Wallet Functionality
3) Wallet-to-Wallet Transfer: Enables secure funds transfers between wallets.
4) Bank Withdrawals: Directly withdraw funds to a bank account.
5) Wallet Top-Up: Easily add balance to a wallet.
6) Transaction History
7) Detailed Logs: View transaction history, including wallet transfers and withdrawals.

# Technology Stack
1) Spring Boot: Core framework for the backend.
2) MySQL: Database for storing user data, transaction history, and portfolio information.
3) Spring Security: Manages secure access and authentication.
4) Java Mail Sender: Sends important notifications and password recovery emails.

# Er Diagram
+---------------------+           +-----------------+
|       Users         |<--------->|    Wallets      |
|---------------------|           +-----------------+
| id                  |               ^            
| fullName            |               |
| email               |               |         
| ...                 |               |
+---------------------+               |
                                      |
+--------------------+            +-----------------+
|      Assets        |<---------->| WalletTransactions|
|--------------------|            +-----------------+
| id                 |
| quantity           |
| buy_price          |<---------->+-----------------+
| coin_id            |            |  Coins          |
| user_id            |            +-----------------+
+--------------------+            | id              |
                                  | symbol          |
+--------------------+            | ...             |
| Withdrawals        |<---------->+-----------------+
|--------------------|
| id                 |
| status             |
| amount             |
| user_id            |
| date               |
+--------------------+

+--------------------+
| Watchlists         |
|--------------------+
| id                 |
| user_id            |
+--------------------+
          |
          |
          v
+--------------------+
| Watchlist_Coins    |
|--------------------+
| watchlist_id       |
| coin_id            |
+--------------------+

+---------------------+           +---------------------+
|   VerificationCodes |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| otp                 |
| user_id             |
| email               |
| mobile              |
| verification_type   |
+---------------------+

+---------------------+           +---------------------+
|  TradingHistories   |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| selling_price       |
| buying_price        |
| coin_id             |
| user_id             |
+---------------------+

+---------------------+           +---------------------+
|    PaymentOrders    |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| amount              |
| status              |
| payment_method      |
| user_id             |
+---------------------+

+---------------------+           +---------------------+
|   PaymentDetails    |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| account_number      |
| account_holder_name |
| ifsc                |
| bank_name           |
| user_id             |
+---------------------+

+---------------------+           +---------------------+
|        Orders       |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| user_id             |
| order_type          |
| price               |
| timestamp           |
| status              |
| order_item_id       |
+---------------------+
          |
          |
          v
+---------------------+           +---------------------+
|      OrderItems     |<--------->|        Coins        |
|---------------------|           +---------------------+
| id                  |
| quantity            |
| coin_id             |
| buy_price           |
| sell_price          |
| order_id            |
+---------------------+

+---------------------+             +---------------------+
|    Notifications    | <---------> |        Users        |
|---------------------|             +---------------------+
| id                  |
| from_user_id        |
| to_user_id          |
| amount              |
| message             |
+---------------------+

+---------------------+           
|   MarketChartData   |
|---------------------|
| id                  |
| timestamp           |
| price               |
+---------------------+

+---------------------+           +---------------------+
| ForgotPasswordTokens|<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| user_id             |
| otp                 |
| verification_type   |
| send_to             |
+---------------------+

# Prerequisites
1) Java 17
2) MySQL server
3) Maven for dependency management

# Test Api End Points
API testing can be performed via Postman or any API testing client.
