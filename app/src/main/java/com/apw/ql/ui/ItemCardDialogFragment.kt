//package com.apw.ql.ui
//
//import android.os.Build
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.DialogFragment
//import com.apw.ql.R
//import com.apw.ql.data.model.Repo
//import com.apw.ql.toDefaultTime
//
//private const val KEY_ARGS_REPO = "com.example.displaygu.key_args_repo"
//class ItemCardDialogFragment : DialogFragment() {
//
//    companion object {
//
//        fun newInstance(repo: Repo): ItemCardDialogFragment {
//            val args = Bundle()
//            args.putParcelable(KEY_ARGS_REPO, repo)
//            val fragment = ItemCardDialogFragment()
//            fragment.arguments = args
//            return fragment
//        }
//    }
//
//    private lateinit var binding: FragmentItemCardBinding
//
//    private var repo: Repo? = null
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        binding = FragmentItemCardBinding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        repo = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
//            arguments?.getParcelable(KEY_ARGS_REPO, Repo::class.java)
//        } else {
//            arguments?.getParcelable(KEY_ARGS_REPO)
//        }
//
//        repo?.htmlUrl?.let {
//            binding.webView.loadUrl(it)
//        }
//    }
//}