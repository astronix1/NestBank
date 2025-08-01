
# 📱 NestBank

NestBank is a modern **banking app UI** built using **Jetpack Compose**, showcasing elegant design, modular code, and smooth navigation between functional banking sections. It simulates the interface of a digital banking experience, including cards, wallets, transactions, analytics, and more.

> ⚠️ This is a **UI-only** project and does not include backend services or real financial integrations.

---

## 🚀 Features

- 📲 **Modern UI** with Jetpack Compose and Material 3
- 🗂️ Modular code structure (Cards, Wallets, Currencies, etc.)
- 🔄 Seamless navigation using `NavHost` and `NavController`
- 🌓 Dynamic System UI color control (using Accompanist)
- 🧭 Persistent Bottom Navigation with screen switching
- 🧪 Test-ready structure with Compose previews

---

## 🧱 App Structure

```
NestBank/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/nestbank/
│   │       │   ├── MainActivity.kt            // Entry point
│   │       │   ├── AppNavigation.kt           // Manages navigation between screens
│   │       │   ├── BottomNavigationBar.kt     // Bottom navigation component
│   │       │   ├── CardsSection.kt            // UI for credit/debit cards
│   │       │   ├── WalletSection.kt           // UI for wallet overview
│   │       │   ├── CurrenciesSection.kt       // Currency rates display
│   │       │   ├── FinanceSection.kt          // Budget, expenses, etc.
│   │       │   ├── AnalyticsScreen.kt         // Analytics & graphs
│   │       │   ├── NotificationScreen.kt      // Notifications UI
│   │       │   ├── WalletScreen.kt            // Wallet management screen
│   │       │   ├── AccountScreen.kt           // Profile/account settings
│   │       └── res/                           // (Default resources)
│   ├── build.gradle.kts
├── build.gradle.kts
```

---

## 🛠️ Tech Stack

| Tech/Library              | Purpose                            |
|--------------------------|------------------------------------|
| Kotlin                   | Primary language                   |
| Jetpack Compose          | Declarative UI toolkit             |
| Material 3               | Modern Material design components  |
| Accompanist              | System UI control (status bar, etc.) |
| Navigation Compose       | In-app navigation                  |

---

## 📸 Screens (Preview Components)

- 🏠 **Home Screen** – Card balance, recent transactions, wallet overview
- 💳 **Cards** – List and design of credit/debit cards
- 💰 **Wallet** – Spending categories and charts
- 📊 **Analytics** – Financial breakdowns and spending trends
- 🔔 **Notifications** – Alerts and updates
- 👤 **Account** – Profile, settings, and preferences

---

## 🧪 How to Run

1. ✅ Clone the repository:
   ```bash
   git clone https://github.com/astronix1/NestBank.git
   ```

2. 🧑‍💻 Open in **Android Studio Hedgehog** or later.

3. 📦 Let Gradle sync and download all dependencies.

4. ▶️ Run the app on an emulator or physical device (API 24+).

---

## 📋 Requirements

- Android Studio Arctic Fox or newer
- Kotlin 1.9+
- Compile SDK: 36
- Min SDK: 24

---

## 🔮 Future Plans

- [ ] Firebase Authentication
- [ ] Real-time transaction feed
- [ ] Backend integration for live financial data
- [ ] Dark mode & accessibility support

---

## 🙏 Credits

This project was built as a UI showcase for learning and demonstration purposes using modern Android development tools.

---

