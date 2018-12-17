package vn.linh.androidpreferencelibrary

import android.os.Bundle
import android.widget.Toast
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreferenceCompat

class MySettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }

    override fun onPreferenceTreeClick(preference: Preference?): Boolean {
        val key = preference?.key
        if (key == "notifications") {
            if (preference is SwitchPreferenceCompat) {
                Toast.makeText(requireContext(), "checked " + preference.isChecked, Toast.LENGTH_SHORT).show()
            }
            return true
        }
        if (key == "feedback") {
            Toast.makeText(requireContext(), "clicked " + preference.title, Toast.LENGTH_SHORT).show()
            return true
        }
        return false
    }
}
