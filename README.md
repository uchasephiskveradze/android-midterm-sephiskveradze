# Advanced Wealth Tracker - Intermediate Task

## Student Information
- **Name:** Ucha
- **Surname:** Sephiskveradze
- **Birth Date:** 3

## Custom Formula (K)
As per the task requirements:
- **Letters in Name (Ucha):** 4
- **Letters in Surname (Sephiskveradze):** 14
- **Birth Day:** 3

**Formula:**
`K = (4 + 14) / 3 = 18 / 3 = 6.0`

**Calculation:**
`Final Savings = (Income - Expenses) * 6.0`

## Implementation Details
- **Naming Convention:** All Resource IDs are prefixed with `usze_` (Ucha + Sephiskveradze's last two letters).
- **Dynamic Orientation:** Since the surname "Sephiskveradze" starts with a consonant ('S'), the `ViewPager2` is configured with `ORIENTATION_VERTICAL`.
- **Architecture:** Single Activity Architecture using `ViewPager2`, `TabLayout`, and `Fragment Result API`.
- **Logic:** All calculations are handled in the `WealthManager.kt` class.
