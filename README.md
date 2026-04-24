# Advanced Wealth Tracker - Android Midterm

A functional Android application developed for the Mobile Application Development course, demonstrating core Android development principles and architecture.

## 🚀 Key Features
- **Modern Navigation**: Implementation of `ViewPager2` with `TabLayoutMediator` for seamless fragment transitions.
- **Dynamic UI**: Orientation is programmatically adjusted based on the developer's surname (Vertical orientation for "Sephiskveradze").
- **Data Communication**: Utilization of the modern `Fragment Result API` to exchange data between fragments without a ViewModel.
- **Business Logic Separation**: All financial calculations are encapsulated within a dedicated `WealthManager` class, following OOP best practices.
- **Form Validation**: Real-time input validation using `setError` on UI components for an improved user experience.

## 📐 Custom Logic (K Coefficient)
The application uses a personalized formula (K) to calculate estimated savings:
- **Formula**: `K = (Letters in Name + Letters in Surname) / Day of Birth`
- **Current Parameters**: (Ucha: 4 + Sephiskveradze: 14) / 3 = **6.0**
- **Calculation**: `Final Savings = (Income - Expenses) * 6.0`

## 🛠 Technical Stack
- **Language**: Kotlin
- **Architecture**: Single Activity with ViewPager2 & Fragments
- **Layouts**: 100% ConstraintLayout for responsive design
- **Components**: Material Design 3, Fragment Result API, ViewPager2, TabLayout

## 🛡️ Anti-Copy Policy
To ensure originality, all resource identifiers follow a strict naming convention:
- **Prefix**: `us_dze_` (Initials + Surname ending)
- **Example ID**: `us_dze_et_income`, `us_dze_btn_save`

---
**Developed by:** Ucha Sephiskveradze
**Course:** Mobile Application Development
