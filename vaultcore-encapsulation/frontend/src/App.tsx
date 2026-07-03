import { Header } from '@/components/layout/Header'
import { Sidebar } from '@/components/layout/Sidebar'
import { AccountList } from '@/components/accounts/AccountList'
import { AccountDetail } from '@/components/accounts/AccountDetail'
import { EncapsulationPanel } from '@/components/education/EncapsulationPanel'
import { useBankStore } from '@/store/useBankStore'

function App() {
  const activeView = useBankStore((state) => state.activeView)
  const selectedAccountId = useBankStore((state) => state.selectedAccountId)

  return (
      <div className="min-h-screen bg-ink vault-mesh">
        <Header />
        <div className="max-w-7xl mx-auto flex">
          <Sidebar />
          <main className="flex-1 px-6 py-8 min-w-0">
            {activeView === 'lab' ? (
                <EncapsulationPanel />
            ) : selectedAccountId ? (
                <AccountDetail accountId={selectedAccountId} />
            ) : (
                <AccountList />
            )}
          </main>
        </div>
      </div>
  )
}

export default App